import interfaces.Mentor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.FullTimeMentor;

public class CybertekApp {

    public static void main(String[] args) {

        //BeanFactory container=new ClassPathXmlApplicationContext("config.xml");  //creating a container

        ApplicationContext container=new ClassPathXmlApplicationContext("config.xml"); // another way of creating container

        //Mentor mentor= (Mentor) container.getBean("fullTimeMentor");  //casting

        Mentor mentor=container.getBean("fullTimeMentor",Mentor.class);

        mentor.createAccount();

        //Mentor mentor1= (Mentor) container.getBean("partTimeMentor");
        Mentor mentor1=container.getBean("partTimeMentor",Mentor.class); // no need to casting in this way
        mentor1.createAccount();
    }
}