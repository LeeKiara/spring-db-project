package com.lhm.ipms.contact;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QContact is a Querydsl query type for Contact
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QContact extends EntityPathBase<Contact> {

    private static final long serialVersionUID = -146680709L;

    public static final QContact contact = new QContact("contact");

    public final NumberPath<Long> activityCnt = createNumber("activityCnt", Long.class);

    public final StringPath email = createString("email");

    public final StringPath image = createString("image");

    public final StringPath latestActivityContent = createString("latestActivityContent");

    public final StringPath name = createString("name");

    public final NumberPath<Long> ownerId = createNumber("ownerId", Long.class);

    public final StringPath phone = createString("phone");

    public QContact(String variable) {
        super(Contact.class, forVariable(variable));
    }

    public QContact(Path<? extends Contact> path) {
        super(path.getType(), path.getMetadata());
    }

    public QContact(PathMetadata metadata) {
        super(Contact.class, metadata);
    }

}

