package FashionDesignStudio;

import FashionDesignStudio.Models.Bottoms;
import FashionDesignStudio.Models.Tops;

/**
 * Abstract factory interface for creating outfit components.
 * Implements the Abstract Factory design pattern.
 */
public interface OutfitFactory {
    /**
     * Creates a Bottoms object.
     * @return A Bottoms object for the outfit.
     */
    Bottoms createBottoms();

    /**
     * Creates a Tops object.
     * @return A Tops object for the outfit.
     */
    Tops createTops();
}