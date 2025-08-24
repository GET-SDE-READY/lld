package com.getsdeready.designpatterns.behavioral.state;

public class Driver {

    public static void main(String[] args) {
        DocumentEditor documentEditor = new DocumentEditor();

        documentEditor.performKeyPress();

        documentEditor.setEditingMode(new SelectionMode());
        documentEditor.performKeyClick();
        documentEditor.performKeyPress();

        documentEditor.setEditingMode(new WritingMode());
        documentEditor.performKeyClick();
        documentEditor.performKeyPress();

        documentEditor.setEditingMode(new ErasingMode());
        documentEditor.performKeyClick();
        documentEditor.performKeyPress();
    }
}
