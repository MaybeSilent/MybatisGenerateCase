
import Mapper.NewsMapper;
import Pojo.News;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.Date;

public class NewsMapperTest {

    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void setUp() throws Exception{
        // 创建sqlSessionFactory
        String resource = "SqlMapConfig.xml"; // mybatis配置文件
        // 得到配置文件的流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //System.out.println(inputStream);
        // 创建会话工厂SqlSessionFactory,要传入mybaits的配置文件的流
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void testInsert(){
        SqlSession sqlSession = sqlSessionFactory.openSession();


        NewsMapper newsMapper = sqlSession.getMapper(NewsMapper.class);

        News news = new News();
        news.setId(0);
        news.setTitle("Hello World");
        news.setUrl("www.helloworld.com");
        news.setTimestamp(new Date());
        newsMapper.insert(news);
        sqlSession.commit();
    }
}
