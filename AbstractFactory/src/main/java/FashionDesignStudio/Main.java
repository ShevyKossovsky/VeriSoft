package FashionDesignStudio;

import FashionDesignStudio.Models.Bottoms;
import FashionDesignStudio.Models.Tops;

public class Main {

    public static void main(String[] args) {
        // Create factories for casual and formal outfits
        OutfitFactory casualOutfitFactory = new CasualOutfitFactory();
        OutfitFactory formalOutfitFactory = new FormalOutfitFactory();

        // Create tops using the respective factories
        Tops formalTops = formalOutfitFactory.createTops();
        Tops casualTops = casualOutfitFactory.createTops();

        // Create bottoms using the respective factories
        Bottoms formalBottoms = formalOutfitFactory.createBottoms();
        Bottoms casualBottoms = casualOutfitFactory.createBottoms();

        // Enjoy the created tops and bottoms
        formalTops.enjoy();
        casualTops.enjoy();
        formalBottoms.enjoy();
        casualBottoms.enjoy();
    }
}
