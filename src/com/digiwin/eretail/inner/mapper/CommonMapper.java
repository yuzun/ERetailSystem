package com.digiwin.eretail.inner.mapper;

import java.util.List;

import com.digiwin.eretail.inner.model.TableInfo;

public interface CommonMapper {
    public List<TableInfo> getAllFields(String table);
}