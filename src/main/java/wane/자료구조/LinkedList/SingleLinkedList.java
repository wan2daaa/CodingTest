package wane.자료구조.LinkedList;

public class SingleLinkedList<T>{
    public Node<T> head = null;

    public class Node<T>{
        T data;
        Node<T> next = null;

        public Node(T data){
            this.data = data;
        }
    }


    public void addNode(T data){
        //첫번째 node 가 null 이면,
        if(head==null){
            //들어온 data 로 head를 node로 추가
            head = new Node<T>(data);
        }else{
            //첫번째 node(= head) 가 있다면,
            Node<T> node = this.head;

            //만약 다음 node을 가리키는 포인터가 null 이 아닐 동안,
            while(node.next != null){
                //node 를 다음 node 로 이동
                node = node.next;
                //결국 마지막 node 에 도달
            }
            // 현재 있는 LinkedList 의 마지막 node 다음에 data인 새 node 추가
            node.next = new Node<T>(data);
        }
    }

    public void printAll(){
        if(head!= null){
            Node<T> node = this.head;
            System.out.println(node.data);
            while(node.next != null){
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    public Node<T> search(T data){

        // 만약 head 가 없다면, 당연히 null
        if(this.head == null){
            return null;
        }else{
            //head node 가 있으면, head node 부터 검색
            Node<T> node = this.head;
            //만약 node 가 null 이 아닐 동안,
            while(node != null){
                // 원하는 data 이면 이 node 를 리턴
                if(node.data == data){
                    return node;
                    //아니면 다음 node 로 가서 계속 반복
                }else{
                    node = node.next;
                }
            }
            //만약 node 가 null 이면 == 찾고 싶은 data가 현재 linkedlist에 없다면,
            return null;
        }
    }


    //isData == 넣을 곳 바로 전의 node
    public void addNodeInside(T data, T isData){

        // 삽입할 node 앞쪽에 있는 node
        Node<T> searchedNode = this.search(isData);

        if  (searchedNode == null){
            this.addNode(data);
        }else{
            //원래 앞의 node 가 가리키는 node 를 저장
            Node<T> nextNode = searchedNode.next;

            //앞쪽 node 의 다음 노드는 삽입할 node 로 연결
            searchedNode.next = new Node<T>(data);
            // 삽입할 node 가 가리키는 node 는 넣을 곳 바로 다음의 node 로 연결
            searchedNode.next.next = nextNode;
        }
    }

}