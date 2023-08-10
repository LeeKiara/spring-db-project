package com.lhm.ipms.auth.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QLogin is a Querydsl query type for Login
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QLogin extends EntityPathBase<Login> {

    private static final long serialVersionUID = 198438413L;

    public static final QLogin login = new QLogin("login");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> profileId = createNumber("profileId", Long.class);

    public final StringPath secret = createString("secret");

    public final StringPath username = createString("username");

    public QLogin(String variable) {
        super(Login.class, forVariable(variable));
    }

    public QLogin(Path<? extends Login> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLogin(PathMetadata metadata) {
        super(Login.class, metadata);
    }

}

