/*
 * This file is generated by jOOQ.
*/
package generated.rx.jdbc.guice.vertx;


import generated.rx.jdbc.guice.vertx.tables.Something;
import generated.rx.jdbc.guice.vertx.tables.Somethingcomposite;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling indexes of tables of the <code>VERTX</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index SYS_IDX_SYS_PK_10304_10305 = Indexes0.SYS_IDX_SYS_PK_10304_10305;
    public static final Index SYS_IDX_SYS_PK_10306_10307 = Indexes0.SYS_IDX_SYS_PK_10306_10307;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 extends AbstractKeys {
        public static Index SYS_IDX_SYS_PK_10304_10305 = createIndex("SYS_IDX_SYS_PK_10304_10305", Something.SOMETHING, new OrderField[] { Something.SOMETHING.SOMEID }, true);
        public static Index SYS_IDX_SYS_PK_10306_10307 = createIndex("SYS_IDX_SYS_PK_10306_10307", Somethingcomposite.SOMETHINGCOMPOSITE, new OrderField[] { Somethingcomposite.SOMETHINGCOMPOSITE.SOMEID, Somethingcomposite.SOMETHINGCOMPOSITE.SOMESECONDID }, true);
    }
}