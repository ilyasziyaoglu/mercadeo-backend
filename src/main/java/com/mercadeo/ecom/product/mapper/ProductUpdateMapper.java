package com.mercadeo.ecom.product.mapper;

import com.mercadeo.ecom.brand.mapper.BrandUpdateMapper;
import com.mercadeo.ecom.category.mapper.CategoryUpdateMapper;
import com.mercadeo.ecom.client.product.ProductRequest;
import com.mercadeo.ecom.client.productsize.SizeRequest;
import com.mercadeo.ecom.common.basemodel.mapper.BaseUpdateMapper;
import com.mercadeo.ecom.product.db.entity.Product;
import com.mercadeo.ecom.productcolor.mapper.ProductColorUpdateMapper;
import com.mercadeo.ecom.sizes.db.repository.SizeRepository;
import com.mercadeo.ecom.stock.mapper.StockUpdateMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Component
@RequiredArgsConstructor
public class ProductUpdateMapper implements BaseUpdateMapper<ProductRequest, Product> {

	final private BrandUpdateMapper brandUpdateMapper;
	final private CategoryUpdateMapper categoryUpdateMapper;
	final private ProductColorUpdateMapper productColorUpdateMapper;
	final private StockUpdateMapper stockUpdateMapper;
	final private SizeRepository sizeRepository;

	@Override
	public Product toEntityForUpdate(ProductRequest request, Product entity) {
		if (!request.getName().isEmpty()) {
			entity.setName(request.getName());
		}
		if (request.getBrand() != null) {
			entity.setBrand(brandUpdateMapper.toEntityForUpdate(request.getBrand(), entity.getBrand()));
		}
		if (request.getImgUrl() != null) {
			entity.setImgUrl(request.getImgUrl());
		}
		if (request.getPrice() != null) {
			entity.setPrice(request.getPrice());
		}
		if ( request.getCategory1() != null) {
			entity.setCategory1(categoryUpdateMapper.toEntityForUpdate(request.getCategory1(), entity.getCategory1()));
		}
		if ( request.getCategory2() != null) {
			entity.setCategory2(categoryUpdateMapper.toEntityForUpdate(request.getCategory2(), entity.getCategory2()));
		}
		if ( request.getCategory2() != null) {
			entity.setCategory3(categoryUpdateMapper.toEntityForUpdate(request.getCategory3(), entity.getCategory3()));
		}
		if (request.getCollection() != null && !request.getCollection().equals(entity.getCollection())) {
			entity.setCollection(request.getCollection());
		}
		if (request.getDescription() != null) {
			entity.setDescription(request.getDescription());
		}
		if (request.getStatus() != null) {
			entity.setStatus(request.getStatus());
		}
		if (request.getProductColors() != null) {
			entity.setProductColors(productColorUpdateMapper.toEntityForUpdate(request.getProductColors(), entity.getProductColors()));
		}
		if (request.getIsColorsOptional() != null) {
			entity.setIsColorsOptional(request.getIsColorsOptional());
		}
		if (request.getIsSizesOptional() != null) {
			entity.setIsSizesOptional(request.getIsSizesOptional());
		}
		if (request.getSizes() != null) {
			entity.setSizes(sizeRepository.findByIdIn(request.getSizes().stream().map(SizeRequest::getId).collect(Collectors.toSet())));
		}
		if (request.getStocks() != null) {
			entity.setStocks(stockUpdateMapper.toEntityForUpdate(request.getStocks(), entity.getStocks()));
		}
		if (request.getFeatures() != null) {
			entity.setFeatures(request.getFeatures());
		}
		if (request.getTags() != null) {
			entity.setTags(request.getTags());
		}
		return entity;
	}
}
