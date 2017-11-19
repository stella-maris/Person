class Person
{
    private String firstName;
    private String lastName;
    private int age;
    private double height;
    
 /**
 * Default constructor to setup person object.
 * 
 * @param _firstName The first name of the person.
 * @param _lastName The last name of the person.
 * @param _age The age of the person in years.
 * @param _height The height of person in centimeters.
 */

public Person (String _firstName, String _lastName, int _age, double _height)
{
    firstName = _firstName;
    lastName = _lastName;
    
    if (_age <= 0)
    {
        age = 1;
    }
    else {
        age = _age;
    }
    
    if (_height <= 0 )
    {
        height = 1;
    } else {
    height = _height;
    }
}

/**
 * Gets you a cheeky opinion of what is considered old in English terms.
 * 
 * @return The English representation of the person's age.
 */
public boolean isOld()
{
    if (age >= 60)
    {
        return true;
    } else {
        return false;
    }
}

/**
 * Gets you the height of person in English terms.
 * 
 * @return The English fact of what is considered tall.
 */
public boolean isTall()
{
    if (height >= 180)
    {
        return true;
    } else {
        return false;
    }
}
}
