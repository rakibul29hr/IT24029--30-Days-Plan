

class OuterClass {

    private String message = "Hello from Outer Class";


    //  Inner Class
    class MemberInner {

        void display() {
            System.out.println("Member Inner Class: " + message);
        }
    }


    // Method containing Local Inner Class
    void localInnerExample() {

        class LocalInner {

            void show() {
                System.out.println("Local Inner Class Example");
            }
        }

        LocalInner local = new LocalInner();
        local.show();
    }


    // Anonymous Inner Class Example
    void anonymousInnerExample() {

        Runnable r = new Runnable() {

            @Override
            public void run() {
                System.out.println("Anonymous Inner Class Running");
            }
        };

        r.run();
    }


    // Static Nested Class
    static class StaticNested {

        void display() {
            System.out.println("Static Nested Class Example");
        }
    }
}


// Event handling example using anonymous inner class
class Button {

    interface ClickListener {
        void onClick();
    }

    void setOnClickListener(ClickListener listener) {
        listener.onClick();
    }
}



public class Day26Example2 {

    public static void main(String[] args) {

        System.out.println(" Member Inner Class ");

        OuterClass outer = new OuterClass();

        OuterClass.MemberInner inner = outer.new MemberInner();
        inner.display();


        System.out.println("\n Local Inner Class");

        outer.localInnerExample();


        System.out.println("\n Anonymous Inner Class");

        outer.anonymousInnerExample();


        System.out.println("\n Static Nested Class");

        OuterClass.StaticNested nested = new OuterClass.StaticNested();
        nested.display();


        System.out.println("\n Event Handling Example ");

        Button btn = new Button();

        btn.setOnClickListener(new Button.ClickListener() {

            @Override
            public void onClick() {
                System.out.println("Button Clicked!");
            }
        });


        System.out.println("\n Encapsulation Support ");

        System.out.println("Inner classes help access private members securely.");
    }
}
