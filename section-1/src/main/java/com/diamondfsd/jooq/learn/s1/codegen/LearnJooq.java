/*
 * This file is generated by jOOQ.
 */
package com.diamondfsd.jooq.learn.s1.codegen;


import com.diamondfsd.jooq.learn.s1.codegen.tables.S1User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LearnJooq extends SchemaImpl {

    private static final long serialVersionUID = -511655766;

    /**
     * The reference instance of <code>learn-jooq</code>
     */
    public static final LearnJooq LEARN_JOOQ = new LearnJooq();

    /**
     * The table <code>learn-jooq.s1-user</code>.
     */
    public final S1User S1_USER = com.diamondfsd.jooq.learn.s1.codegen.tables.S1User.S1_USER;

    /**
     * No further instances allowed
     */
    private LearnJooq() {
        super("learn-jooq", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            S1User.S1_USER);
    }
}
