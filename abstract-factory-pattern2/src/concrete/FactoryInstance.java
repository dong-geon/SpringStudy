package concrete;

import abst.Button;
import abst.GuiFac;
import abst.TextArea;

public class FactoryInstance {
    public static GuiFac getGuiFac() {
        System.getProperty("os.name");
        // 대충 스위치에 올바른 운영체제가 들어갈 수 있도록
        switch (1){
            case 0:
                return new MacGuiFac();
            case 1:
                return new LinuxGuiFac();
            case 2:
                return new WinGuiFac();
        }
        return null;
    }
}
class LinuxGuiFac implements GuiFac {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public TextArea createTextArea() {
        return new LinuxTextArea();
    }
}
class LinuxButton implements Button {
    @Override
    public void click() {
        System.out.println("Linux Button");
    }
}
class LinuxTextArea implements TextArea {
    @Override
    public String getText() {
        return "Linux TextArea";
    }
}


class MacGuiFac implements GuiFac {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public TextArea createTextArea() {
        return new MacTextArea();
    }
}
class MacButton implements Button {
    @Override
    public void click() {
        System.out.println("Mac Button");
    }
}
class MacTextArea implements TextArea {
    @Override
    public String getText() {
        return "Mac TextArea";
    }
}
class WinGuiFac implements GuiFac {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public TextArea createTextArea() {
        return new WinTextArea();
    }
}
class WinButton implements Button {
    @Override
    public void click() {
        System.out.println("Window Button");
    }
}
class WinTextArea implements TextArea {
    @Override
    public String getText() {
        return "Window TextArea";
    }
}
