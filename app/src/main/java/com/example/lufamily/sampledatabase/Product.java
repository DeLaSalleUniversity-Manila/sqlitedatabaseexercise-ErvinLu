package com.example.lufamily.sampledatabase;

/**
 * Created by Lu Family on 10/20/2015.
 */
public class Product {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Product[] product = {
            new Product("ZenBook Pro UX501", "The stunningly-beautiful ZenBook Pro UX501 doesn\'t just lead its class - it redefines it. Using the best materials, the finest craftsmanship and the most advanced high-performance components, ZenBook Pro has jaw-dropping style and breathtaking performance. The timelessly-elegant design of the ZenBook family, with the iconic spun-metal finish echoing the spirit of Zen, is subtly enhanced with brilliant diamond-cut highlights and brushed-metal surfaces that add a touch of sophistication. The elegant theme is continued in the stylish ripple-effect pattern laser-engraved on its surface. ZenBook Pro is more than an incredibly-powerful laptop - it\'s a true work of art.", R.drawable.a),
            new Product("ASUS ZENBOOK UX303LN", "Zenbook is a finely-crafted Ultrabook with a harmonious blend of style, practicality and performance. UX303 takes this to another level of sophistication with a fresh new shape and gorgeous Smoky Brown color scheme, further enhanced by the iconic spun-metal finish that echoes the spirit of Zen. The classic lines of the ultra-light, all-aluminum Zenbook have been enhanced with a slimmer profile, tapering to just 3mm at the front. It\'s chic, elegant, timeless, and powerful - it\'s Zenbook UX303! ", R.drawable.b),
            new Product("ASUS ZENBOOK UX305FA", "Elegant, ultra-slim, and powerful, the ASUS Zenbook UX305FA is premium in every way. It\'s under a half-inch thick, weighs only 2.6 pounds, and has an Intel Core M processor for peak performance. It\'s pretty luxurious, too, built from a block of aluminum with ASUS\' signature spun-metal finish on the lid. And with Windows 10, you get easy ways to snap apps in place, create new desktops, and work and play across all your devices.", R.drawable.c)
    };

    private Product(String name, String description, int imageResourceId)
    {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription()
    {
        return description;
    }

    public String getName()
    {
        return name;
    }

    public int getImageResourceId()
    {
        return imageResourceId;
    }

    public String toString()
    {
        return this.name;
    }
}
