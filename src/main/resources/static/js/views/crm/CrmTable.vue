<template>
    <v-card width="85%">
        <v-card-title>
            <h1>{{this.title}}</h1>
            <v-spacer></v-spacer>
            <v-text-field
                    v-model="search"
                    append-icon="search"
                    label="Пошук"
                    single-line
                    hide-details
            ></v-text-field>
        </v-card-title>
        <v-data-table
                :headers="this.headers"
                :items="desserts"
                :search="search"
                item-key="name"
                class="elevation-3"
        >
            <template slot="items" slot-scope="props">
                <td>{{ props.item.name }}</td>
                <td class="text-xs-right">{{ props.item.calories }}</td>
                <td class="text-xs-right">{{ props.item.fat }}</td>
                <td class="text-xs-right">{{ props.item.carbs }}</td>
                <td class="text-xs-right">{{ props.item.protein }}</td>
                <td class="text-xs-right">{{ props.item.iron }}</td>
            </template>
            <v-alert slot="no-results" :value="true" color="error" icon="warning">
                Your search for "{{ search }}" found no results.
            </v-alert>
        </v-data-table>
    </v-card>
</template>

<script>
    export default {
        name: "CrmTable",

        props: {
          title: String
        },

        data(){
            return{
                search: '',
                headers: [
                    {
                        text: 'Назва',
                        align: 'left',
                        sortable: true,
                        value: 'name',
                    },
                    {text: 'Область', value: 'calories'},
                    {text: 'Район', value: 'fat'},
                    {text: 'Фактична адреса', value: 'carbs'},
                    {text: 'Адреса поля', value: 'protein'},
                    {text: 'Ким створений', value: 'iron'},
                    {text: 'Дата створення', value: 'iron'},
                    {text: 'Ким змінений', value: 'iron'},
                    {text: 'Дата змінення', value: 'iron'},
                    {text: 'Розмір компанії', value: 'iron'},
                    {text: 'Площа поля', value: 'iron'},
                    {text: 'Обладнання', value: 'iron'},
                    {text: 'Джерело', value: 'iron'},
                    {text: 'Захід', value: 'iron'},
                    {text: 'Остання дія', value: 'iron'},
                    {text: 'Відповідальний', value: 'iron'},
                    {text: 'Другий відповідальний', value: 'iron'},
                    {text: 'Технічний відповідальний', value: 'iron'},
                    {text: 'Культури', value: 'iron'},
                    {text: 'Факс', value: 'iron'},
                    {text: 'Веб сайт', value: 'iron'},
                    {text: 'Контактна особа', value: 'iron'},
                    {text: 'Теплокарта', value: 'iron'}
                ],
                desserts: [
                    {
                        name: 'Frozen Yogurt',
                        calories: 159,
                        fat: 6.0,
                        carbs: 24,
                        protein: 4.0,
                        iron: '1%',
                    },
                    {
                        name: 'Ice cream sandwich',
                        calories: 237,
                        fat: 9.0,
                        carbs: 37,
                        protein: 4.3,
                        iron: '1%',
                    }
                ]
            }
        }
    }
</script>

<style scoped>

</style>