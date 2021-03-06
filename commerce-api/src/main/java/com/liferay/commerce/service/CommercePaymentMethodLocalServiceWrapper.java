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

package com.liferay.commerce.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CommercePaymentMethodLocalService}.
 *
 * @author Alessio Antonio Rendina
 * @see CommercePaymentMethodLocalService
 * @generated
 */
@ProviderType
public class CommercePaymentMethodLocalServiceWrapper
	implements CommercePaymentMethodLocalService,
		ServiceWrapper<CommercePaymentMethodLocalService> {
	public CommercePaymentMethodLocalServiceWrapper(
		CommercePaymentMethodLocalService commercePaymentMethodLocalService) {
		_commercePaymentMethodLocalService = commercePaymentMethodLocalService;
	}

	/**
	* Adds the commerce payment method to the database. Also notifies the appropriate model listeners.
	*
	* @param commercePaymentMethod the commerce payment method
	* @return the commerce payment method that was added
	*/
	@Override
	public com.liferay.commerce.model.CommercePaymentMethod addCommercePaymentMethod(
		com.liferay.commerce.model.CommercePaymentMethod commercePaymentMethod) {
		return _commercePaymentMethodLocalService.addCommercePaymentMethod(commercePaymentMethod);
	}

	@Override
	public com.liferay.commerce.model.CommercePaymentMethod addCommercePaymentMethod(
		java.util.Map<java.util.Locale, String> nameMap,
		java.util.Map<java.util.Locale, String> descriptionMap,
		java.io.File imageFile, String engineKey,
		java.util.Map<String, String> engineParameterMap, double priority,
		boolean active,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _commercePaymentMethodLocalService.addCommercePaymentMethod(nameMap,
			descriptionMap, imageFile, engineKey, engineParameterMap, priority,
			active, serviceContext);
	}

	/**
	* Creates a new commerce payment method with the primary key. Does not add the commerce payment method to the database.
	*
	* @param commercePaymentMethodId the primary key for the new commerce payment method
	* @return the new commerce payment method
	*/
	@Override
	public com.liferay.commerce.model.CommercePaymentMethod createCommercePaymentMethod(
		long commercePaymentMethodId) {
		return _commercePaymentMethodLocalService.createCommercePaymentMethod(commercePaymentMethodId);
	}

	/**
	* Deletes the commerce payment method from the database. Also notifies the appropriate model listeners.
	*
	* @param commercePaymentMethod the commerce payment method
	* @return the commerce payment method that was removed
	* @throws PortalException
	*/
	@Override
	public com.liferay.commerce.model.CommercePaymentMethod deleteCommercePaymentMethod(
		com.liferay.commerce.model.CommercePaymentMethod commercePaymentMethod)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _commercePaymentMethodLocalService.deleteCommercePaymentMethod(commercePaymentMethod);
	}

	/**
	* Deletes the commerce payment method with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param commercePaymentMethodId the primary key of the commerce payment method
	* @return the commerce payment method that was removed
	* @throws PortalException if a commerce payment method with the primary key could not be found
	*/
	@Override
	public com.liferay.commerce.model.CommercePaymentMethod deleteCommercePaymentMethod(
		long commercePaymentMethodId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _commercePaymentMethodLocalService.deleteCommercePaymentMethod(commercePaymentMethodId);
	}

	@Override
	public void deleteCommercePaymentMethods(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		_commercePaymentMethodLocalService.deleteCommercePaymentMethods(groupId);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _commercePaymentMethodLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _commercePaymentMethodLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _commercePaymentMethodLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.commerce.model.impl.CommercePaymentMethodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _commercePaymentMethodLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.commerce.model.impl.CommercePaymentMethodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _commercePaymentMethodLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _commercePaymentMethodLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _commercePaymentMethodLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.liferay.commerce.model.CommercePaymentMethod fetchCommercePaymentMethod(
		long commercePaymentMethodId) {
		return _commercePaymentMethodLocalService.fetchCommercePaymentMethod(commercePaymentMethodId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _commercePaymentMethodLocalService.getActionableDynamicQuery();
	}

	/**
	* Returns the commerce payment method with the primary key.
	*
	* @param commercePaymentMethodId the primary key of the commerce payment method
	* @return the commerce payment method
	* @throws PortalException if a commerce payment method with the primary key could not be found
	*/
	@Override
	public com.liferay.commerce.model.CommercePaymentMethod getCommercePaymentMethod(
		long commercePaymentMethodId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _commercePaymentMethodLocalService.getCommercePaymentMethod(commercePaymentMethodId);
	}

	/**
	* Returns a range of all the commerce payment methods.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.commerce.model.impl.CommercePaymentMethodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of commerce payment methods
	* @param end the upper bound of the range of commerce payment methods (not inclusive)
	* @return the range of commerce payment methods
	*/
	@Override
	public java.util.List<com.liferay.commerce.model.CommercePaymentMethod> getCommercePaymentMethods(
		int start, int end) {
		return _commercePaymentMethodLocalService.getCommercePaymentMethods(start,
			end);
	}

	@Override
	public java.util.List<com.liferay.commerce.model.CommercePaymentMethod> getCommercePaymentMethods(
		long groupId) {
		return _commercePaymentMethodLocalService.getCommercePaymentMethods(groupId);
	}

	@Override
	public java.util.List<com.liferay.commerce.model.CommercePaymentMethod> getCommercePaymentMethods(
		long groupId, boolean active) {
		return _commercePaymentMethodLocalService.getCommercePaymentMethods(groupId,
			active);
	}

	@Override
	public java.util.List<com.liferay.commerce.model.CommercePaymentMethod> getCommercePaymentMethods(
		long groupId, long commerceCountryId, boolean active) {
		return _commercePaymentMethodLocalService.getCommercePaymentMethods(groupId,
			commerceCountryId, active);
	}

	/**
	* Returns the number of commerce payment methods.
	*
	* @return the number of commerce payment methods
	*/
	@Override
	public int getCommercePaymentMethodsCount() {
		return _commercePaymentMethodLocalService.getCommercePaymentMethodsCount();
	}

	@Override
	public int getCommercePaymentMethodsCount(long groupId, boolean active) {
		return _commercePaymentMethodLocalService.getCommercePaymentMethodsCount(groupId,
			active);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _commercePaymentMethodLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _commercePaymentMethodLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _commercePaymentMethodLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public com.liferay.commerce.model.CommercePaymentMethod setActive(
		long commercePaymentMethodId, boolean active)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _commercePaymentMethodLocalService.setActive(commercePaymentMethodId,
			active);
	}

	/**
	* Updates the commerce payment method in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param commercePaymentMethod the commerce payment method
	* @return the commerce payment method that was updated
	*/
	@Override
	public com.liferay.commerce.model.CommercePaymentMethod updateCommercePaymentMethod(
		com.liferay.commerce.model.CommercePaymentMethod commercePaymentMethod) {
		return _commercePaymentMethodLocalService.updateCommercePaymentMethod(commercePaymentMethod);
	}

	@Override
	public com.liferay.commerce.model.CommercePaymentMethod updateCommercePaymentMethod(
		long commercePaymentMethodId,
		java.util.Map<java.util.Locale, String> nameMap,
		java.util.Map<java.util.Locale, String> descriptionMap,
		java.io.File imageFile,
		java.util.Map<String, String> engineParameterMap, double priority,
		boolean active,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _commercePaymentMethodLocalService.updateCommercePaymentMethod(commercePaymentMethodId,
			nameMap, descriptionMap, imageFile, engineParameterMap, priority,
			active, serviceContext);
	}

	@Override
	public CommercePaymentMethodLocalService getWrappedService() {
		return _commercePaymentMethodLocalService;
	}

	@Override
	public void setWrappedService(
		CommercePaymentMethodLocalService commercePaymentMethodLocalService) {
		_commercePaymentMethodLocalService = commercePaymentMethodLocalService;
	}

	private CommercePaymentMethodLocalService _commercePaymentMethodLocalService;
}