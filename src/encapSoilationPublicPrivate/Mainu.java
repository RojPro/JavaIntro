package encapSoilationPublicPrivate;

import encapSoilationPublicPrivate.encapSoilationPublicPrivateSub.PrivatpublicJassmin;
import encapSoilationPublicPrivate.encapSoilationPublicPrivateSub.PrivatpublicRobin;

public class Mainu {

    public static void main(String [] args){


        // using for robin
        PrivatpublicRobin pbr = new PrivatpublicRobin();
        pbr.myName();
        pbr.myage();



        // using for jassmin

        PrivatpublicJassmin pbj = new PrivatpublicJassmin();
        System.out.println(pbj.first_name("Munir"));
        System.out.println(pbj.last_name("Ahmed"));



    }
}
