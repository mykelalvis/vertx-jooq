/*
 * This file is generated by jOOQ.
 */
package generated.rx.reactive.regular.vertx;


import generated.rx.reactive.regular.vertx.tables.Something;
import generated.rx.reactive.regular.vertx.tables.Somethingcomposite;
import generated.rx.reactive.regular.vertx.tables.Somethingwithoutjson;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in vertx
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>vertx.something</code>.
     */
    public static final Something SOMETHING = Something.SOMETHING;

    /**
     * The table <code>vertx.somethingComposite</code>.
     */
    public static final Somethingcomposite SOMETHINGCOMPOSITE = Somethingcomposite.SOMETHINGCOMPOSITE;

    /**
     * The table <code>vertx.somethingWithoutJson</code>.
     */
    public static final Somethingwithoutjson SOMETHINGWITHOUTJSON = Somethingwithoutjson.SOMETHINGWITHOUTJSON;
}
