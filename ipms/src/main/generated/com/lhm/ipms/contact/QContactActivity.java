package com.lhm.ipms.contact;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QContactActivity is a Querydsl query type for ContactActivity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QContactActivity extends EntityPathBase<ContactActivity> {

    private static final long serialVersionUID = -1338670934L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QContactActivity contactActivity = new QContactActivity("contactActivity");

    public final QContact contact;

    public final StringPath content = createString("content");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QContactActivity(String variable) {
        this(ContactActivity.class, forVariable(variable), INITS);
    }

    public QContactActivity(Path<? extends ContactActivity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QContactActivity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QContactActivity(PathMetadata metadata, PathInits inits) {
        this(ContactActivity.class, metadata, inits);
    }

    public QContactActivity(Class<? extends ContactActivity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.contact = inits.isInitialized("contact") ? new QContact(forProperty("contact")) : null;
    }

}

