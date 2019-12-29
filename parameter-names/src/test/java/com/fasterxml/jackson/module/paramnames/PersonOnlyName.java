package com.fasterxml.jackson.module.paramnames;

class PersonOnlyName {

    // mandatory fields
    private final String name;

    // no annotations are required if preconditions are met (details below)
    public PersonOnlyName(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }
}