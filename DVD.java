public class DVD
{
    public String name;
    public int releaseYear;
    public String director;

    //Defining Constructor of DVD
    public DVD(String name, int releaseYear, String director)
    {
        this.name = name;
        this.releaseYear = releaseYear;
        this.director = director;
    }

    /*
    If you want to represent any object as a string, toString() method comes into existence.
    The toString() method returns the String representation of the object.
    If you print any object, Java compiler internally invokes the toString() method on the object. So overriding the toString() method,
    returns the desired output, it can be the state of an object etc. depending on your implementation.
    By overriding the toString() method of the Object class, we can return values of the object, so we don't need to write much code.
     */
    public String toString()
    {
        return this.name+", directed by "+this.director+", released in "+this.releaseYear;
    }
}
class collection
{
    DVD incredibles = new DVD("The Incredibles", 2004, "Brad Bird");
    DVD findingDory = new DVD("Finding Dory", 2016, "Andrew Stanton");
    DVD lionKing = new DVD("The Lion King", 2019, "Jon Favreau");
    DVD avengers = new DVD("The Avengers", 2012, "Joss Whedon");
}
