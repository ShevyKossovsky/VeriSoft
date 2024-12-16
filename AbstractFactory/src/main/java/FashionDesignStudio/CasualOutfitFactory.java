package FashionDesignStudio;

import FashionDesignStudio.Models.Bottoms;
import FashionDesignStudio.Models.Tops;

public class CasualOutfitFactory implements OutfitFactory {
    @Override
    public Bottoms createBottoms() {
        System.out.println("Creating Casual Outfit...");
        return new CasualBottom();
    }

    @Override
    public Tops createTops() {
        System.out.println("Creating Formal Outfit...");
        return new CasualTop();
    }
}
