// Copyright (C) 2015 Oregon State University - School of Mechanical,Industrial and Manufacturing Engineering 
//   This file is part of Transit Network Analysis Software Tool.
//
//    Transit Network Analysis Software Tool is free software: you can redistribute it and/or modify
//    it under the terms of the GNU General Public License as published by
//    the Free Software Foundation, either version 3 of the License, or
//    (at your option) any later version.
//
//    Transit Network Analysis Software Tool is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU  General Public License for more details.
//
//    You should have received a copy of the GNU  General Public License
//    along with Transit Network Analysis Software Tool.  If not, see <http://www.gnu.org/licenses/>.


package com.model.database.queries.objects;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.onebusaway.gtfs.model.AgencyAndId;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.model.database.onebusaway.gtfs.hibernate.objects.ext.RouteExt;

@XmlRootElement(name = "route")
public class RouteType {

    public RouteType() {
    }

    public RouteType(RouteExt route) {
        this.id = route.getId();
        this.routeShortName = route.getShortName();
        this.routeLongName = route.getLongName();
        this.routeDesc = route.getDesc();
        this.routeType = route.getType();
        this.routeUrl = route.getUrl();
        this.routeColor = route.getColor();
        this.routeTextColor = route.getTextColor();
        this.routeBikesAllowed = route.getBikesAllowed();
    }

    public RouteType(RouteExt route, Boolean extended) {
        this.id = route.getId();
        this.routeShortName = route.getShortName();
        this.routeType = route.getType();
        this.routeLongName = route.getLongName();
        if (extended != null && extended.equals(true)) {
            this.routeDesc = route.getDesc();
            this.routeType = route.getType();
            this.routeUrl = route.getUrl();
            this.routeColor = route.getColor();
            this.routeTextColor = route.getTextColor();
        }
    }
    
    public AgencyAndId getId(){
        return this.id;
    }

    @XmlJavaTypeAdapter(AgencyAndIdAdapter.class)
    @JsonSerialize
    AgencyAndId id;

    @XmlJavaTypeAdapter(AgencyAndIdAdapter.class)
    @JsonSerialize
    AgencyAndId serviceId;

    @XmlAttribute
    @JsonSerialize
    String routeShortName;

    @XmlAttribute
    @JsonSerialize
    String routeLongName;

    @XmlAttribute
    @JsonSerialize
    String routeDesc;

    @XmlAttribute
    @JsonSerialize
    String routeUrl;

    @XmlAttribute
    @JsonSerialize
    String routeColor;

    @XmlAttribute
    @JsonSerialize
    Integer routeType;

    @XmlAttribute
    @JsonSerialize
    String routeTextColor;

    @XmlAttribute
    @JsonSerialize
    Integer routeBikesAllowed;

}
