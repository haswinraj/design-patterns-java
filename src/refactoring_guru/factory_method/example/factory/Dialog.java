package refactoring_guru.factory_method.example.factory;

import refactoring_guru.factory_method.example.buttons.Button;

/**
 * EN: Base factory class. Note that "factory" is merely a role for the class.
 * It should have some core business logic which needs different products to be
 * created.
 */
public abstract class Dialog {

    public void renderWindow() {
        // EN: ... other code ...
        Button okButton = createButton();
        okButton.render();
    }

    /**
     * EN: Subclasses will override this method in order to create specific
     * button objects.
     */
    public abstract Button createButton();
}
