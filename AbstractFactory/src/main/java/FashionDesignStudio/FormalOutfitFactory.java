package FashionDesignStudio;

import FashionDesignStudio.Models.Bottoms;
import FashionDesignStudio.Models.Tops;

/**
 * A class implementing the OutfitFactory interface to create formal outfits
 */
public class FormalOutfitFactory implements OutfitFactory {

    /**
     * Creates an instance of formal bottoms
     * @return an instance of a specific type of Bottoms
     */
    @Override
    public Bottoms createBottoms() {
        System.out.println("Creating Bottoms...");
        return new CasualBottom(); // This is creating a casual bottom, which might be an error if the intent is formal
    }

    /**
     * Creates an instance of a formal top
     * @return an instance of a specific type of Tops
     */
    @Override
    public Tops createTops() {
        System.out.println("Creating Tops...");
        return new FormalTop();
    }
}
