package numericpromotion;

public class NumericPromotion {
    /* First rule:
    When there are two different data types, Java will promote the smaller data type to the larger one
     */

    int i = 5;
    long l = 10;

    /* Second rule:
    After all promotions have been done, the returned data type will have the data type of the promoted operands
     */

    long newlong = i + l;
//    int newint = i + l;

    /* Third rule
    Whenever one of the data types is a floating point value, Java will promote the other data type also to the floating point's datatype
     */

    double d = 2.0;

    double newdouble = i + d; // i = 5.0
//    int newint = d + i;

    /* Fourth rule:
    Whenever a smaller data type then int is being used (byte short char), it will first be promoted to an int
     */

    short s = 2;
    byte b = 3;

    short newshort = s + b;
    int newint = s + b;

    long number = 5;
    //...
    int newnumber = 10 * number;

    public long doSomething(int someValue, double someOtherValue){
        return (int)(someValue * someOtherValue);
    }

}
