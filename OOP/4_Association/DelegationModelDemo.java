// Delegation means to handover the responsibilty for a particular task to another class or method.
// It is a technique where an object expresses certain behaviour to outside world but in reality delegates the responsibility for implementing the behaviour to an associated object.

class Worker {
    public void wash() {
        System.out.println("Washing...");
    }

    public void dust() {
        System.out.println("Dusting...");
    }

    public void clean() {
        System.out.println("Cleaning...");
    }
}

class Supervisor {
    // Has-A relationship for delegation
    Worker w = new Worker();

    public void wash() {
        w.wash(); // Delegating to Worker
    }

    public void dust() {
        w.dust(); // Delegating to Worker
    }

    public void clean() {
        w.clean(); // Delegating to Worker
    }
}

public class DelegationModelDemo { // A class for the owner
    public static void main(String[] args) {
        Supervisor s = new Supervisor();
        
        // Owner handovers responsibility to Supervisor
        s.wash();
        s.dust();
        s.clean();
    }
}