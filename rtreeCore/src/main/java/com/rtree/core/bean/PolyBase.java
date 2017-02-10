package com.rtree.core.bean;


import com.rtree.core.rtree.geometry.Geometry;
import com.rtree.core.rtree.geometry.Point;

import java.io.Serializable;

public abstract class PolyBase implements Serializable {

    private Geometry geometry;
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public abstract boolean searchPoint(Point point);
}
