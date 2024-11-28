package AbstractFactoryPattern;

// Abstract Product A
interface Button {
    void render();
}

// Abstract Product B
interface Checkbox {
    void render();
}

// Concrete Product A1
class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a Windows button");
    }
}

// Concrete Product B1
class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering a Windows checkbox");
    }
}

// Concrete Product A2
class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a Mac button");
    }
}

// Concrete Product B2
class MacCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering a Mac checkbox");
    }
}

// Abstract Factory
interface UIFactory {
    Button createButton();

    Checkbox createCheckbox();
}

// Concrete Factory 1 (for Windows)
class WindowsFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

// Concrete Factory 2 (for Mac)
class MacFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}

public class AbstractFactory {
    public static void renderUI(UIFactory factory) {
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.render();
        checkbox.render();
    }

    public static void main(String[] args) {
        // Use Windows UI
        UIFactory windowsFactory = new WindowsFactory();
        renderUI(windowsFactory); // Output: "Rendering a Windows button", "Rendering a Windows checkbox"

        // Use Mac UI
        UIFactory macFactory = new MacFactory();
        renderUI(macFactory); // Output: "Rendering a Mac button", "Rendering a Mac checkbox"
    }
}
