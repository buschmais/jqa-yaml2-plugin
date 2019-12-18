package com.buschmais.jqassistant.plugin.yaml2.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Property;
import com.buschmais.xo.neo4j.api.annotation.Relation;

@Label("Key")
public interface YMLKeyDescriptor extends YMLDescriptor {
    String getName();

    @Property("name")
    void setName(String name);

    @Relation("HAS_VALUE")
    YMLDescriptor getValue();

    void setValue(YMLDescriptor descriptor);
}