import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;

/**
 * Created by zhanggang3 on 2015/11/25.
 */
public class MyComponent implements ApplicationComponent {

    public MyComponent() {
    }

    @Override
    public void initComponent() {
        // TODO: insert component initialization logic here
    }

    @Override
    public void disposeComponent() {
        // TODO: insert component disposal logic here
    }

    @Override
    @NotNull
    public String getComponentName() {
        return "MyComponent";
    }

    public void sayHello(){
        Messages.showMessageDialog("Hello World", "Sample", Messages.getInformationIcon());
    }

}
