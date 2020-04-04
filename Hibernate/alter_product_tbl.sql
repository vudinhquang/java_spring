ALTER TABLE `product`
  ADD CONSTRAINT `cate_id_foreignkey` FOREIGN KEY(`CATE_ID`) REFERENCES `category`(`ID`);