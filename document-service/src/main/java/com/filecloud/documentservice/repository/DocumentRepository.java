package com.filecloud.documentservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.filecloud.documentservice.constant.DocumentQueries;
import com.filecloud.documentservice.model.db.Document;


@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {

	List<Document> findByUserId(Long userId);

	List<Document> findByUserIdAndRecycled(Long userId, Boolean recycled);

	Long countByUserIdAndRecycled(Long userId, Boolean recycled);

	@Query(name = DocumentQueries.QUERY_USER_FILES_SIZE)
	Long findUsedSpace(Long userId);

}
