package com.osjager.componentscan.filtertype;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @Author isjager
 *
 * 自定义过滤类型，使用方式
 */
public class OsageFilterType implements TypeFilter {

	@Override
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
		// 获取当前类的注解信息
		AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();

		// 获取当前类的 Class 的源信息
		ClassMetadata classMetadata = metadataReader.getClassMetadata();

		// 获取当前类的资源信息
		Resource resource = metadataReader.getResource();

		if (classMetadata.getClassName().contains("dao")) {
			return true;
		}
		return false;
	}
}
