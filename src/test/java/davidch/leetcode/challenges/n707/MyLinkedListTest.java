package davidch.leetcode.challenges.n707;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MyLinkedListTest {

    @Test
    void example_1() {
        final var list = new MyLinkedList();
        list.addAtHead(1);
        assertThat(list).isEqualTo(new MyLinkedList(1));

        list.addAtTail(3);
        assertThat(list).isEqualTo(new MyLinkedList(1, 3));

        list.addAtIndex(1, 2);
        assertThat(list).isEqualTo(new MyLinkedList(1, 2, 3));

        assertThat(list.get(1)).isEqualTo(2);

        list.deleteAtIndex(1);
        assertThat(list).isEqualTo(new MyLinkedList(1, 3));

        assertThat(list.get(1)).isEqualTo(3);
    }

    @Test
    void example_2() {
        final var list = new MyLinkedList();
        list.addAtIndex(0, 10);
        assertThat(list).isEqualTo(new MyLinkedList(10));

        list.addAtIndex(0, 20);
        assertThat(list).isEqualTo(new MyLinkedList(20, 10));

        list.addAtIndex(1, 30);
        assertThat(list).isEqualTo(new MyLinkedList(20, 30, 10));

        assertThat(list.get(0)).isEqualTo(20);
    }

    @Test
    void example_3() {
        final var list = new MyLinkedList();
        list.addAtIndex(1, 0);
        assertThat(list).isEqualTo(new MyLinkedList());

        assertThat(list.get(0)).isEqualTo(-1);
    }

    @Test
    void get_returns_value_by_index() {
        final var list = new MyLinkedList(1, 2, 3);
        assertThat(list.get(1)).isEqualTo(2);
    }

    @Test
    void get_returns_minus_one_on_empty_list() {
        final var list = new MyLinkedList();
        assertThat(list.get(0)).isEqualTo(-1);
    }

    @Test
    void get_returns_minus_one_on_incorrect_index() {
        final var list = new MyLinkedList(1, 2, 3);
        assertThat(list.get(3)).isEqualTo(-1);
    }

    @Test
    void get_returns_minus_one_on_negative_index() {
        final var list = new MyLinkedList(1, 2, 3);
        assertThat(list.get(-1)).isEqualTo(-1);
    }

    @Test
    void addAtHead_adds_node_to_empty_list() {
        final var list = new MyLinkedList();
        list.addAtHead(42);
        assertThat(list).isEqualTo(new MyLinkedList(42));
    }

    @Test
    void addAtHead_adds_node_to_start_of_the_list() {
        final var list = new MyLinkedList(1, 2, 3);
        list.addAtHead(42);
        assertThat(list).isEqualTo(new MyLinkedList(42, 1, 2, 3));
    }

    @Test
    void addAtTail_adds_element_to_empty_list() {
        final var list = new MyLinkedList();
        list.addAtTail(42);
        assertThat(list).isEqualTo(new MyLinkedList(42));
    }

    @Test
    void addAtTail_adds_last_element_to_list() {
        final var list = new MyLinkedList(1, 2, 3);
        list.addAtTail(42);
        assertThat(list).isEqualTo(new MyLinkedList(1, 2, 3, 42));
    }

    @Test
    void addAtIndex_adds_element_to_empty_list() {
        final var list = new MyLinkedList();
        list.addAtIndex(0, 42);
        assertThat(list).isEqualTo(new MyLinkedList(42));
    }

    @Test
    void addAtIndex_adds_element_to_start_of_list() {
        final var list = new MyLinkedList(1, 2, 3);
        list.addAtIndex(0, 42);
        assertThat(list).isEqualTo(new MyLinkedList(42, 1, 2, 3));
    }

    @Test
    void addAtIndex_adds_element_to_middle_of_list() {
        final var list = new MyLinkedList(1, 2, 3, 4);
        list.addAtIndex(2, 42);
        assertThat(list).isEqualTo(new MyLinkedList(1, 2, 42, 3, 4));
    }

    @Test
    void addAtIndex_adds_element_to_end_of_list() {
        final var list = new MyLinkedList(1, 2, 3);
        list.addAtIndex(3, 42);
        assertThat(list).isEqualTo(new MyLinkedList(1, 2, 3, 42));
    }

    @Test
    void deleteAtIndex_does_nothing_on_empty_list() {
        final var list = new MyLinkedList();
        list.deleteAtIndex(0);
        assertThat(list).isEqualTo(new MyLinkedList());
    }

    @Test
    void deleteAtIndex_deletes_only_element() {
        final var list = new MyLinkedList(1);
        list.deleteAtIndex(0);
        assertThat(list).isEqualTo(new MyLinkedList());
    }

    @Test
    void deleteAtIndex_deletes_head() {
        final var list = new MyLinkedList(1, 2, 3);
        list.deleteAtIndex(0);
        assertThat(list).isEqualTo(new MyLinkedList(2, 3));
    }

    @Test
    void deleteAtIndex_deletes_element_in_the_middle() {
        final var list = new MyLinkedList(1, 2, 3);
        list.deleteAtIndex(1);
        assertThat(list).isEqualTo(new MyLinkedList(1, 3));
    }

    @Test
    void deleteAtIndex_deletes_last_element() {
        final var list = new MyLinkedList(1, 2, 3);
        list.deleteAtIndex(2);
        assertThat(list).isEqualTo(new MyLinkedList(1, 2));
    }

    @Test
    void deleteAtIndex_does_nothing_on_negative_index() {
        final var list = new MyLinkedList(1, 2, 3);
        list.deleteAtIndex(-1);
        assertThat(list).isEqualTo(new MyLinkedList(1, 2, 3));
    }

    @Test
    void deleteAtIndex_does_nothing_on_index_exceeding_maximum() {
        final var list = new MyLinkedList(1, 2, 3);
        list.deleteAtIndex(3);
        assertThat(list).isEqualTo(new MyLinkedList(1, 2, 3));
    }
}