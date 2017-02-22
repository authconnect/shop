package com.salesmanager.core.business.system.optin.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QOptin is a Querydsl query type for Optin
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QOptin extends EntityPathBase<Optin> {

    private static final long serialVersionUID = -1685741187L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOptin optin = new QOptin("optin");

    public final StringPath code = createString("code");

    public final StringPath description = createString("description");

    public final DateTimePath<java.util.Date> endDate = createDateTime("endDate", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.salesmanager.core.business.merchant.model.QMerchantStore merchant;

    public final DateTimePath<java.util.Date> startDate = createDateTime("startDate", java.util.Date.class);

    public QOptin(String variable) {
        this(Optin.class, forVariable(variable), INITS);
    }

    public QOptin(Path<? extends Optin> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QOptin(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QOptin(PathMetadata<?> metadata, PathInits inits) {
        this(Optin.class, metadata, inits);
    }

    public QOptin(Class<? extends Optin> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.merchant = inits.isInitialized("merchant") ? new com.salesmanager.core.business.merchant.model.QMerchantStore(forProperty("merchant"), inits.get("merchant")) : null;
    }

}

