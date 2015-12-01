import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.application.Application;
import com.intellij.openapi.application.ApplicationManager;

/**
 * Created by zhanggang3 on 2015/11/25.
 */
public class SayHelloAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        Application application = ApplicationManager.getApplication();
        MyComponent myComponent = application.getComponent(MyComponent.class);
        myComponent.sayHello();
    }

}
