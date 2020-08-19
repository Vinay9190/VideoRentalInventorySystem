package definitions;

public class Video {
    // member variable
    //fields/variables of a class

    // creating definition classes in Java

    //rules for creating fields
    // 1. Set the visibility modifiers of the fields to private unless otherwise specified
    // 2. Set the access modifier of the fields to non-static unless otherwise specified.

    private String videoName;
    private boolean checkOut;
    private int rating;

    // we can create special types of methods to access these fields outside the class.
    // 1.Getter Methods:
    // Observer method / Accessor methods
    // we can use the getter methods to access the value of a field i.e read it.

    // 2. Setter Methods:
    // Transformer methods / Mutator methods
    //we can use the setter methods to the set the value of the field i.e read it.

    // 3. Constructor Methods:
    // we can use the constructor methods to initialize the attributes of an object.

    public Video() {

    }

    /*
    * public <noAccessModifier> <noReturnType> <NameOfTheClass() {}
    *
     */

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public void setCheckOut(boolean checkOut) {
        this.checkOut = checkOut;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    /*
    *public <am:sameAsTheFiels> void set<NameOfTheField>(SameAsTheField>) {}
    *
    *
     */
    public String getVideoName() {
        return videoName;
    }

    public int getRating() {
        return rating;
    }

    // exception for booleans: the getter method starts  'is' instead of 'get'

    public boolean isCheckOut() {
        return checkOut;
    }
    /*
    *public
    *
     */
}
