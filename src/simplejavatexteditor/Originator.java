package simplejavatexteditor;

import java.util.List;
import java.util.ArrayList;

public class Originator {
	
	private String state;
	 
    public void setState(String state) {
        System.out.println("Originator: Mudando estado para " + state);
        this.state = state;
    }
    
    public Memento saveState() {
        System.out.println("Originator: Salvando o Memento.");
        return new Memento(this.state);
    }
    
    public void restoreState(Memento memento) {
        this.state = memento.getSavedState();
        System.out.println("Originator: Estado apos restaurar o Memento: " + state);
    }
 
    public static class Memento {
        private final String state;

        public Memento(String stateToSave) {
            this.state = stateToSave;
        }
 
        public String getSavedState() {
            return this.state;
        }
    }
}
