package OPtional_VenkatSubramaniam;


import java.util.Optional;

public class Mains {
    static Optional<String> getName()
    {
        if(Math.random()>0.2)
        {
            return Optional.of("Anay");
        }
        return Optional.empty();
    }
    public static void main(String[] args)
    {
        Optional<String> name= Mains.getName();
        System.out.println(name.orElseGet(()->{
            return "Amey";
        }));
    }
}

// If a method will always have single value as a result please don't use Optional.
//If a method may or may not have a single value as a result then use optional.
// If the result is a collection, the don't use Optional
//Don't use Optional<T> as a parameter to method. Use overloading instead.
// There is little reason to use optional as a field
