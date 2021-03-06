/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.commerce.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the CommerceWarehouse service. Represents a row in the &quot;CommerceWarehouse&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.commerce.model.impl.CommerceWarehouseModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.commerce.model.impl.CommerceWarehouseImpl}.
 * </p>
 *
 * @author Alessio Antonio Rendina
 * @see CommerceWarehouse
 * @see com.liferay.commerce.model.impl.CommerceWarehouseImpl
 * @see com.liferay.commerce.model.impl.CommerceWarehouseModelImpl
 * @generated
 */
@ProviderType
public interface CommerceWarehouseModel extends BaseModel<CommerceWarehouse>,
	GroupedModel, ShardedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a commerce warehouse model instance should use the {@link CommerceWarehouse} interface instead.
	 */

	/**
	 * Returns the primary key of this commerce warehouse.
	 *
	 * @return the primary key of this commerce warehouse
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this commerce warehouse.
	 *
	 * @param primaryKey the primary key of this commerce warehouse
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the commerce warehouse ID of this commerce warehouse.
	 *
	 * @return the commerce warehouse ID of this commerce warehouse
	 */
	public long getCommerceWarehouseId();

	/**
	 * Sets the commerce warehouse ID of this commerce warehouse.
	 *
	 * @param commerceWarehouseId the commerce warehouse ID of this commerce warehouse
	 */
	public void setCommerceWarehouseId(long commerceWarehouseId);

	/**
	 * Returns the group ID of this commerce warehouse.
	 *
	 * @return the group ID of this commerce warehouse
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this commerce warehouse.
	 *
	 * @param groupId the group ID of this commerce warehouse
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this commerce warehouse.
	 *
	 * @return the company ID of this commerce warehouse
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this commerce warehouse.
	 *
	 * @param companyId the company ID of this commerce warehouse
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this commerce warehouse.
	 *
	 * @return the user ID of this commerce warehouse
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this commerce warehouse.
	 *
	 * @param userId the user ID of this commerce warehouse
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this commerce warehouse.
	 *
	 * @return the user uuid of this commerce warehouse
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this commerce warehouse.
	 *
	 * @param userUuid the user uuid of this commerce warehouse
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this commerce warehouse.
	 *
	 * @return the user name of this commerce warehouse
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this commerce warehouse.
	 *
	 * @param userName the user name of this commerce warehouse
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this commerce warehouse.
	 *
	 * @return the create date of this commerce warehouse
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this commerce warehouse.
	 *
	 * @param createDate the create date of this commerce warehouse
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this commerce warehouse.
	 *
	 * @return the modified date of this commerce warehouse
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this commerce warehouse.
	 *
	 * @param modifiedDate the modified date of this commerce warehouse
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the name of this commerce warehouse.
	 *
	 * @return the name of this commerce warehouse
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this commerce warehouse.
	 *
	 * @param name the name of this commerce warehouse
	 */
	public void setName(String name);

	/**
	 * Returns the description of this commerce warehouse.
	 *
	 * @return the description of this commerce warehouse
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this commerce warehouse.
	 *
	 * @param description the description of this commerce warehouse
	 */
	public void setDescription(String description);

	/**
	 * Returns the active of this commerce warehouse.
	 *
	 * @return the active of this commerce warehouse
	 */
	public boolean getActive();

	/**
	 * Returns <code>true</code> if this commerce warehouse is active.
	 *
	 * @return <code>true</code> if this commerce warehouse is active; <code>false</code> otherwise
	 */
	public boolean isActive();

	/**
	 * Sets whether this commerce warehouse is active.
	 *
	 * @param active the active of this commerce warehouse
	 */
	public void setActive(boolean active);

	/**
	 * Returns the street1 of this commerce warehouse.
	 *
	 * @return the street1 of this commerce warehouse
	 */
	@AutoEscape
	public String getStreet1();

	/**
	 * Sets the street1 of this commerce warehouse.
	 *
	 * @param street1 the street1 of this commerce warehouse
	 */
	public void setStreet1(String street1);

	/**
	 * Returns the street2 of this commerce warehouse.
	 *
	 * @return the street2 of this commerce warehouse
	 */
	@AutoEscape
	public String getStreet2();

	/**
	 * Sets the street2 of this commerce warehouse.
	 *
	 * @param street2 the street2 of this commerce warehouse
	 */
	public void setStreet2(String street2);

	/**
	 * Returns the street3 of this commerce warehouse.
	 *
	 * @return the street3 of this commerce warehouse
	 */
	@AutoEscape
	public String getStreet3();

	/**
	 * Sets the street3 of this commerce warehouse.
	 *
	 * @param street3 the street3 of this commerce warehouse
	 */
	public void setStreet3(String street3);

	/**
	 * Returns the city of this commerce warehouse.
	 *
	 * @return the city of this commerce warehouse
	 */
	@AutoEscape
	public String getCity();

	/**
	 * Sets the city of this commerce warehouse.
	 *
	 * @param city the city of this commerce warehouse
	 */
	public void setCity(String city);

	/**
	 * Returns the zip of this commerce warehouse.
	 *
	 * @return the zip of this commerce warehouse
	 */
	@AutoEscape
	public String getZip();

	/**
	 * Sets the zip of this commerce warehouse.
	 *
	 * @param zip the zip of this commerce warehouse
	 */
	public void setZip(String zip);

	/**
	 * Returns the commerce region ID of this commerce warehouse.
	 *
	 * @return the commerce region ID of this commerce warehouse
	 */
	public long getCommerceRegionId();

	/**
	 * Sets the commerce region ID of this commerce warehouse.
	 *
	 * @param commerceRegionId the commerce region ID of this commerce warehouse
	 */
	public void setCommerceRegionId(long commerceRegionId);

	/**
	 * Returns the commerce country ID of this commerce warehouse.
	 *
	 * @return the commerce country ID of this commerce warehouse
	 */
	public long getCommerceCountryId();

	/**
	 * Sets the commerce country ID of this commerce warehouse.
	 *
	 * @param commerceCountryId the commerce country ID of this commerce warehouse
	 */
	public void setCommerceCountryId(long commerceCountryId);

	/**
	 * Returns the latitude of this commerce warehouse.
	 *
	 * @return the latitude of this commerce warehouse
	 */
	public double getLatitude();

	/**
	 * Sets the latitude of this commerce warehouse.
	 *
	 * @param latitude the latitude of this commerce warehouse
	 */
	public void setLatitude(double latitude);

	/**
	 * Returns the longitude of this commerce warehouse.
	 *
	 * @return the longitude of this commerce warehouse
	 */
	public double getLongitude();

	/**
	 * Sets the longitude of this commerce warehouse.
	 *
	 * @param longitude the longitude of this commerce warehouse
	 */
	public void setLongitude(double longitude);

	/**
	 * Returns the primary of this commerce warehouse.
	 *
	 * @return the primary of this commerce warehouse
	 */
	public boolean getPrimary();

	/**
	 * Returns <code>true</code> if this commerce warehouse is primary.
	 *
	 * @return <code>true</code> if this commerce warehouse is primary; <code>false</code> otherwise
	 */
	public boolean isPrimary();

	/**
	 * Sets whether this commerce warehouse is primary.
	 *
	 * @param primary the primary of this commerce warehouse
	 */
	public void setPrimary(boolean primary);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(CommerceWarehouse commerceWarehouse);

	@Override
	public int hashCode();

	@Override
	public CacheModel<CommerceWarehouse> toCacheModel();

	@Override
	public CommerceWarehouse toEscapedModel();

	@Override
	public CommerceWarehouse toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}