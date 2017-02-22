package com.salesmanager.core.business.system.optin.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QCustomerOptin is a Querydsl query type for CustomerOptin
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QCustomerOptin extends EntityPathBase<CustomerOptin> {

    private static final long serialVersionUID = 224802623L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCustomerOptin customerOptin = new QCustomerOptin("customerOptin");

    public final StringPath email = createString("email");

    public final StringPath firstName = createString("firstName");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastName = createString("lastName");

    public final QOptin optin;

    public final DateTimePath<java.util.Date> optinDate = createDateTime("optinDate", java.util.Date.class);

    public final StringPath value = createString("value");

    public QCustomerOptin(String variable) {
        this(CustomerOptin.class, forVariable(variable), INITS);
    }

    public QCustomerOptin(Path<? extends CustomerOptin> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCustomerOptin(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCustomerOptin(PathMetadata<?> metadata, PathInits inits) {
        this(CustomerOptin.class, metadata, inits);
    }

    public QCustomerOptin(Class<? extends CustomerOptin> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.optin = inits.isInitialized("optin") ? new QOptin(forProperty("optin"), inits.get("optin")) : null;
    }

}

