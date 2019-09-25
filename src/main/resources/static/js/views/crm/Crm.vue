<template>
    <v-container class="mt-5">
        <v-layout row>
            <v-flex xs3 col>
                <v-navigation-drawer class="pr-3">
                    <v-list dance nav>
                        <v-btn large v-for="button in buttons" :key="button.id" block :color="button.color"
                               class="ml-2 mr-2 text-lg-left">
                            <v-icon class="mr-3">{{button.icon}}</v-icon>
                            {{button.name}}
                            <v-spacer></v-spacer>
                        </v-btn>
                    </v-list>
                </v-navigation-drawer>
            </v-flex>
            <v-flex xs12 col>
                <crm-table v-bind:title="this.title" />
            </v-flex>
        </v-layout>
    </v-container>
</template>

<script>
    import CrmTable from "./CrmTable.vue";

    export default {
        name: "crm",
        components: {CrmTable},
        data() {
            return {
                title: "CRM",
                buttons: [
                    {id: 1, name: "Додати контакт", color: "primary", icon: "person_add"},
                    {id: 2, name: "Показати менеджерів", color: "blue-grey", icon: "person_pin"},
                    {id: 3, name: "Оновити клієнтів", color: "success", icon: "update"},
                    {id: 4, name: "Оновити лідів", color: "success", icon: "update"},
                    {id: 5, name: "Отримати дублікати", color: "success", icon: "list_alt"},
                    {id: 6, name: "Backups", color: "secondary", icon: "backup"},
                    {id: 7, name: "Невизначені клієнти", color: "secondary", icon: "person"},
                    {id: 8, name: "Аналітика", color: "error", icon: "timeline"}
                ]
            }
        },

        actions(index) {
            switch (index) {
                case 0:
                    ;
                    break;
                case 1:
                    ;
                    break;
                case 2:
                    ;
                    break;
                case 3:
                    ;
                    break;
                case 4:
                    ;
                    break;
                case 5:
                    ;
                    break;
                case 6:
                    ;
                    break;
                case 7:
                    ;
                    break;
                case 8:
                    ;
                    break;
                default:
                    ;
                    break;
            }
        }
    }
</script>

<style scoped>

</style>