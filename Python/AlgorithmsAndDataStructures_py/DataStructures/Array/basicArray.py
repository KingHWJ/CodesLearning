# -*- encoding: utf-8 -*-
"""
@File    : basicArray.py
@Time    : 2020/11/26 下午4:53
@Author  : KingHWJ
@Software: PyCharm
@desc    : 基本数组类
"""

class Array(object):

    def __init__(self,size = 0):

        self.max_size = size    # 数组最大长度
        self.use_size = 0       # 数组可用长度
        self.array = []

    def add(self,data):
        """
        数组中添加元素
        :type data: 数据
        """
        self.array.append(data)

    def delete(self, data):
        """
        删除数组中的某个元素
        :rtype: 是否删除成功
        """
        if data not in self.array:
            return False
        else:
            self.array.remove(data)
            return True

    def update(self,data,val):
        """
        更新数据
        :param data: 原数据
        :param val: 新数据
        :return: 是否更新成功
        """
        if data not in self.array:
            print("数组中未发现 %d，更新失败"%data)
            return False
        else:
            for i in range(self.getLen()):
                if self.array[i] == data:
                    self.array[i] = val
                    break
        return True


    def getLen(self):
        """
        获取数组大小
        :return: 数组长度
        """
        return len(self.array)


    def show(self):
        """
        展示列表元素
        :rtype: object
        """
        print(self.array)


if __name__ == '__main__':

    array = Array()
    array.add(10)
    array.add(20)
    array.add(30)
    array.add(30)
    array.show()

    print(array.delete(-10))
    array.show()

    array.update(30,100)
    array.show()



