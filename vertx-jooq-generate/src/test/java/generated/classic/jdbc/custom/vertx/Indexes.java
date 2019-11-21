/*
 * This file is generated by jOOQ.
 */
package generated.classic.jdbc.custom.vertx;


import generated.classic.jdbc.custom.vertx.tables.Something;
import generated.classic.jdbc.custom.vertx.tables.Somethingcomposite;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>VERTX</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index SYS_IDX_SYS_PK_10396_10398 = Indexes0.SYS_IDX_SYS_PK_10396_10398;
    public static final Index SYS_IDX_SYS_PK_10400_10401 = Indexes0.SYS_IDX_SYS_PK_10400_10401;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index SYS_IDX_SYS_PK_10396_10398 = Internal.createIndex("SYS_IDX_SYS_PK_10396_10398", Something.SOMETHING, new OrderField[] { Something.SOMETHING.SOMEID }, true);
        public static Index SYS_IDX_SYS_PK_10400_10401 = Internal.createIndex("SYS_IDX_SYS_PK_10400_10401", Somethingcomposite.SOMETHINGCOMPOSITE, new OrderField[] { Somethingcomposite.SOMETHINGCOMPOSITE.SOMEID, Somethingcomposite.SOMETHINGCOMPOSITE.SOMESECONDID }, true);
    }
}
