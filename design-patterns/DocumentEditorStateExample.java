// State interface
interface EditingMode {
    void handleMouseClick();
    void handleKeyPress();
    String getName();
}

// ConcreteState implementations
class SelectionMode implements EditingMode {
    @Override
    public void handleMouseClick() {
        System.out.println("Selected an object.");
    }

    @Override
    public void handleKeyPress() {
        System.out.println("Pressed a key in selection mode.");
    }
    
    public String getName() {
        return "SelectionMode";
    }
}

class DrawingMode implements EditingMode {
    @Override
    public void handleMouseClick() {
        System.out.println("Drew a shape.");
    }

    @Override
    public void handleKeyPress() {
        System.out.println("Pressed a key in drawing mode.");
    }
    
    public String getName() {
        return "DrawingMode";
    }
}

class ErasingMode implements EditingMode {
    @Override
    public void handleMouseClick() {
        System.out.println("Erased an object.");
    }

    @Override
    public void handleKeyPress() {
        System.out.println("Pressed a key in erasing mode.");
    }
    
    public String getName() {
        return "ErasingMode";
    }
}

class DocumentEditor {
    private EditingMode editingMode;

    public DocumentEditor() {
        this.editingMode = new SelectionMode();
    }

    public void setEditingMode(EditingMode editingMode) {
        System.out.println("Changed mode to " + editingMode.getName());
        this.editingMode = editingMode;
    }

    public void performMouseClick() {
        editingMode.handleMouseClick();
    }

    public void performKeyPress() {
        editingMode.handleKeyPress();
    }
}

public class DocumentEditorStateExample {
    public static void main(String[] args) {
        DocumentEditor editor = new DocumentEditor();

        editor.performMouseClick(); // Output depends on the current editing mode (initially in SelectionMode)
        editor.performKeyPress();   // Output depends on the current editing mode (initially in SelectionMode)

        editor.setEditingMode(new DrawingMode());
        editor.performMouseClick(); // Output depends on the current editing mode (now in DrawingMode)

        editor.setEditingMode(new ErasingMode());
        editor.performMouseClick(); // Output depends on the current editing mode (now in ErasingMode)
    }
}
