import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 处理请求逻辑
        String userName = "John"; // 假设这是从数据库或其他地方获取的用户名
        String greetingMessage = "Hello, " + userName + "!";

        // 将数据传递到JSP页面
        request.setAttribute("greeting", greetingMessage);

        // 转发到JSP页面
        request.getRequestDispatcher("/hello.jsp").forward(request, response);
    }
}
