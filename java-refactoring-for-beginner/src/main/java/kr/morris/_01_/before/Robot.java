package kr.morris._01_.before;

public class Robot {
    private String _name;

    public Robot(final String _name) {
        this._name = _name;
    }

    public void order(int command) {
        if (command == 0) {
            System.out.println(_name + " walks");
        } else if (command == 1) {
            System.out.println(_name + " stops");
        } else if (command == 2) {
            System.out.println(_name + " jumps");
        } else {
            System.out.println("Command error. command = " + command);
        }
    }
}
