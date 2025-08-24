package com.getsdeready.designpatterns.behavioral.state;

public class DocumentEditor {

    private EditingMode editingMode;

    public DocumentEditor() {
        this.editingMode = new SelectionMode();
    }

    public void setEditingMode(EditingMode editingMode) {
        this.editingMode = editingMode;
    }

    public void performKeyClick() {
        this.editingMode.handleKeyClick();
    }

    public void performKeyPress() {
        this.editingMode.handleKeyPress();
    }


}
