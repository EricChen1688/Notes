# Redis字符串的编码类型

- 小于 44 字节, 使用 embstr
- 超过 44 字节,使用 raw

分配内存 64 字节, 16 字节是对象头,剩下 48 字节存储 SDS , SDS **sdshdr8** 占用 4 个字节 

分配内存 64 字节 = 对象头 16 字节 + SDS 头 **sdshdr8** 的4 个字节 + **44 个字节内容**

所以分界线是 44 个字节

## 知识点

 [030-字符串存储方式.md](../../13-persistence/02-Redis/010-数据类型-String/030-字符串存储方式.md) 

