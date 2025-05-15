public class ParentChildPolymorphism {
public static void main(String[] args){
    Parent parentForElderChild = new ElderChild();
    parentForElderChild.eat();
    ((ElderChild)parentForElderChild).cry();  // Type Casted to Elder child or simple Down casted

    Parent parentBehaviourForYoungerChild = new YoungerChild();
    parentBehaviourForYoungerChild.eat();
    ((YoungerChild)parentBehaviourForYoungerChild).cry();
//    ((ElderChild)parentBehaviourForYoungerChild).cry(); // Error
    /*
    Because at runtime, parentBehaviourForYoungerChild refers to a YoungerChild object. Casting it to ElderChild is invalid, even though both extend Parent. Java doesn't allow casting sideways between sibling classes.
     */
}
}
