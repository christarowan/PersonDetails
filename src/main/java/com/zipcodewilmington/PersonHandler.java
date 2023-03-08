package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...
    
    public String whileLoop() {
        String result = "";
        StringBuilder sb = new StringBuilder();
        // create a `counter`
        int i = 0;
        while (i < personArray.length)
        {
            Person p = personArray[i];
            sb.append(p.toString());
            i++;
        }
        // while `counter` is less than length of array
            // begin loop

                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop
        result = sb.toString();
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < personArray.length; i++) {
            Person p = personArray[i];
            sb.append(p.toString());
        }

        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
        result = sb.toString();
        return result;
    }



    public String forEachLoop() {
        String result = "";
        StringBuilder sb = new StringBuilder();
        // identify array's type
        // identify array's variable-name
        for (Person p : personArray) {
            sb.append(p.toString());

        }
        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
        result = sb.toString();
        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
